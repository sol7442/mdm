package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.577+0900")
@StaticMetamodel(Mdmpcontcl.class)
public class Mdmpcontcl_ {
	public static volatile SingularAttribute<Mdmpcontcl, String> id;
	public static volatile SingularAttribute<Mdmpcontcl, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmpcontcl, String> actionSource;
	public static volatile SingularAttribute<Mdmpcontcl, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmpcontcl, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmpcontcl, String> category;
	public static volatile SingularAttribute<Mdmpcontcl, String> code;
	public static volatile SingularAttribute<Mdmpcontcl, Date> createDate;
	public static volatile SingularAttribute<Mdmpcontcl, String> itemDefaultValue;
	public static volatile SingularAttribute<Mdmpcontcl, String> nameCode;
	public static volatile SingularAttribute<Mdmpcontcl, Integer> orderInCategory;
	public static volatile SingularAttribute<Mdmpcontcl, Integer> platform;
	public static volatile SingularAttribute<Mdmpcontcl, Date> updateDate;
	public static volatile SingularAttribute<Mdmpcontcl, String> valueType;
}
