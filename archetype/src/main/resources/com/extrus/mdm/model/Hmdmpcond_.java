package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.563+0900")
@StaticMetamodel(Hmdmpcond.class)
public class Hmdmpcond_ {
	public static volatile SingularAttribute<Hmdmpcond, String> id;
	public static volatile SingularAttribute<Hmdmpcond, BigInteger> actionCompany;
	public static volatile SingularAttribute<Hmdmpcond, String> actionSource;
	public static volatile SingularAttribute<Hmdmpcond, BigInteger> actionTime;
	public static volatile SingularAttribute<Hmdmpcond, BigInteger> actionUser;
	public static volatile SingularAttribute<Hmdmpcond, Date> createDate;
	public static volatile SingularAttribute<Hmdmpcond, String> expression;
	public static volatile SingularAttribute<Hmdmpcond, BigInteger> hMdmPolicy_id;
	public static volatile SingularAttribute<Hmdmpcond, String> name;
	public static volatile SingularAttribute<Hmdmpcond, Integer> priority;
	public static volatile SingularAttribute<Hmdmpcond, Date> updateDate;
}
