package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.580+0900")
@StaticMetamodel(Mdmppcond.class)
public class Mdmppcond_ {
	public static volatile SingularAttribute<Mdmppcond, String> id;
	public static volatile SingularAttribute<Mdmppcond, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmppcond, String> actionSource;
	public static volatile SingularAttribute<Mdmppcond, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmppcond, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmppcond, Date> createDate;
	public static volatile SingularAttribute<Mdmppcond, BigInteger> mdmPolicy_id;
	public static volatile SingularAttribute<Mdmppcond, String> name;
	public static volatile SingularAttribute<Mdmppcond, Date> updateDate;
}
