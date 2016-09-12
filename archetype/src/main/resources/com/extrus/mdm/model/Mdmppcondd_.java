package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.580+0900")
@StaticMetamodel(Mdmppcondd.class)
public class Mdmppcondd_ {
	public static volatile SingularAttribute<Mdmppcondd, String> id;
	public static volatile SingularAttribute<Mdmppcondd, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmppcondd, String> actionSource;
	public static volatile SingularAttribute<Mdmppcondd, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmppcondd, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmppcondd, Date> createDate;
	public static volatile SingularAttribute<Mdmppcondd, String> definition;
	public static volatile SingularAttribute<Mdmppcondd, String> expression;
	public static volatile SingularAttribute<Mdmppcondd, String> name;
	public static volatile SingularAttribute<Mdmppcondd, Integer> passingCategory;
	public static volatile SingularAttribute<Mdmppcondd, BigInteger> passingCondition_id;
	public static volatile SingularAttribute<Mdmppcondd, Date> updateDate;
	public static volatile SingularAttribute<Mdmppcondd, Integer> useType;
}
