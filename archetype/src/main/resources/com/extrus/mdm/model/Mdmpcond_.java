package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.575+0900")
@StaticMetamodel(Mdmpcond.class)
public class Mdmpcond_ {
	public static volatile SingularAttribute<Mdmpcond, String> id;
	public static volatile SingularAttribute<Mdmpcond, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmpcond, String> actionSource;
	public static volatile SingularAttribute<Mdmpcond, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmpcond, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmpcond, Date> createDate;
	public static volatile SingularAttribute<Mdmpcond, String> expression;
	public static volatile SingularAttribute<Mdmpcond, BigInteger> mdmPolicy_id;
	public static volatile SingularAttribute<Mdmpcond, String> name;
	public static volatile SingularAttribute<Mdmpcond, Integer> priority;
	public static volatile SingularAttribute<Mdmpcond, Date> updateDate;
}
