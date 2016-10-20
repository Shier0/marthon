package marthon_sts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 球団情報を表すクラス
 *
 * @author Takahiro Eguchi
 *
 */
@Entity
@Table(name = "baseball_teams")
public class Baseball {

	//ID
	@Id
	@Column(name = "id")
	private Integer id;

	//リーグ名
	@Column(name = "league_name")
	private String leagueName;

	//球団名
	@Column(name = "team_name")
	private String teamName;

	//本拠地
	@Column(name = "headquarters")
	private String headquarters;

	//発足
	@Column(name = "inauguration")
	private String inauguration;

	//歴史
	@Column(name = "history")
	private String history;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeague_name() {
		return leagueName;
	}

	public void setLeague_name(String league_name) {
		this.leagueName = league_name;
	}

	public String getTeam_name() {
		return teamName;
	}

	public void setTeam_name(String team_name) {
		this.teamName = team_name;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}
}
