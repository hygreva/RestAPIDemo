/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.UnityScan;
import com.example.demo.service.UnityTagService;

/**
 * @author hchavali
 *
 */
@Controller
@RequestMapping("/unityScan")
public class UnityScanController {

	@Autowired
	UnityTagService unityService;

	@Autowired
	MessageSource messagesource;

	@RequestMapping(value = { "/unityList" }, method = RequestMethod.GET)
	public String ListUnityTags(ModelMap model) {

		List<UnityScan> unityScanTags = unityService.findAllTags();
		model.addAttribute("unityscantags", unityScanTags);
		return "allUnityScanTags";
	}

	@RequestMapping(value = { "/unityAdd" }, method = RequestMethod.GET)
	public String newUnityScanTag(ModelMap model) {
		UnityScan unityScan = new UnityScan();
		model.addAttribute("unityscan", unityScan);
		return "unityUpload";
	}

	@RequestMapping(value = { "/unityAdd" }, method = RequestMethod.POST)
	public String addUnityScanTag(@Valid UnityScan unityScan, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "unityUpload";
		}
		System.out.println(unityScan.toString());
		unityService.saveTagDetails(unityScan);
		model.addAttribute("success", "UnityScan " + unityScan.getTag_id() + " updated to DB successfully.");
		
		return "success";
	}

}
