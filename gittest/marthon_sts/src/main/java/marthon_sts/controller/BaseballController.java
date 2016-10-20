package marthon_sts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import marthon_sts.entity.Baseball;
import marthon_sts.service.BaseballService;

/**
 * 球団情報を操作するコントローラ
 *
 * @author Takahiro Eguchi
 *
 */
@ComponentScan
@Controller
public class BaseballController {

	@Autowired
	private BaseballService service;

	// 球団一覧画面へ遷移
	@RequestMapping("/baseballList")
	public ModelAndView login(ModelAndView mav) {
		mav.setViewName("baseballList");
		List<Baseball> teamList = service.index();
		mav.addObject("teamList", teamList);
		return mav;
	}

	// 球団詳細画面へ遷移
	@RequestMapping("/baseballListDetail")
	public ModelAndView find(Integer id, ModelAndView mav) {
		mav.setViewName("baseballListDetail");
		Baseball teamDetail = service.detail(id);
		mav.addObject("teamDetail", teamDetail);
		return mav;
	}

}
