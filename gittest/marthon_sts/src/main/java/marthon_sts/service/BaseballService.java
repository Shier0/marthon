package marthon_sts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marthon_sts.entity.Baseball;
import marthon_sts.repository.BaseballRepository;

/**
 * 球団情報を表示するサービス
 *
 * @author Takahiro Eguchi
 *
 */
@Service
public class BaseballService {

	@Autowired
	private BaseballRepository repository;

	// 球団一覧を表示するメソッド
	public List<Baseball> index() {
		List<Baseball> teamList = repository.findAll();
		return teamList;
	}

	// 球団情報詳細を表示するメソッド
	public Baseball detail(Integer id) {
		return repository.findOne(id);
	}

}