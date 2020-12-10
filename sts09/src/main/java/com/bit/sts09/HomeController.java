package com.bit.sts09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	String path="D:\\webWorkspace3\\upload\\";	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST )
	public String upload(@RequestParam("sabun") int sabun, MultipartFile file1,Model model) {
		String orgName=file1.getOriginalFilename();
		String reName=System.currentTimeMillis()+"_"+orgName;
		File dest=new File(path+reName);
		try {
			file1.transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		model.addAttribute("name", reName);
		return "download";
	}
	
	@RequestMapping("/download/{name:.+}")// Ȯ���� ���� pathvariable
	public void download(@PathVariable String name,HttpServletResponse res) {
		logger.info(name);//1600740059705_1 -> 1600740059705_1.jpg
		String origin=name.substring(name.indexOf('_')+1);
		File file=new File(path+name);
		if(file.exists()) {
			OutputStream os=null;
			InputStream is=null;
			res.setContentType("application/octet-stream");
			res.setHeader("Content-Disposition", "attachment; filename=\""+origin+"\"");
			try {
				os=res.getOutputStream();
				is=new FileInputStream(file);
				int su=-1;
				while((su=is.read())!=-1)
					os.write(su);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(os!=null)os.close();
					if(is!=null)is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}











