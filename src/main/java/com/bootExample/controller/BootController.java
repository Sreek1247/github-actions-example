package com.bootExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to sreekanth course";
	}
	
	/*echo "# github-actions-example" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/Sreek1247/github-actions-example.git
	git push -u origin main
	*/

}
