package main.java.com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "forest_table")
@NamedQuery(name = "findByName", query = "select forest from ForestEntity forest where forest.name='Kudremukha'")
@NamedQuery(name = "findByState", query = "select forest from ForestEntity forest where forest.state='Karnataka'")
@NamedQuery(name="findAreaByName",query = "select forest.area from ForestEntity forest where forest.name='kanha'")
@NamedQuery(name="findByNameAndStateAndArea",query= "select forest from ForestEntity forest where forest.name='Kanha'and forest.state ='Madhyapradesh'and forest.area='1543'")
@NamedQuery(name="findIdByNameAndState",query= "select forest from ForestEntity forest where forest.id='10'and forest.state ='Arunachal Pradesh'and forest.name='Namdapha'")
@NamedQuery(name="findNameById",query= "select forest.name from ForestEntity forest where forest.id='7'")
@NamedQuery(name="findStateByNameAndArea",query= "select forest.state from ForestEntity forest where forest.name='Kanha'and forest.area='1543'")
@NamedQuery(name="findCount",query= "select count (forest) from ForestEntity forest ")
@NamedQuery(name="findMax",query= "select max(forest.area) from ForestEntity forest")
public class ForestEntity {
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_state")
	private String state;
	@Column(name = "f_area")
	private String area;
	@Column(name = "f_type")
	private String type;

}
