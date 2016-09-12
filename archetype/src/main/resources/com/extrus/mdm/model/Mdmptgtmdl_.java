package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.583+0900")
@StaticMetamodel(Mdmptgtmdl.class)
public class Mdmptgtmdl_ {
	public static volatile SingularAttribute<Mdmptgtmdl, String> id;
	public static volatile SingularAttribute<Mdmptgtmdl, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmptgtmdl, String> actionSource;
	public static volatile SingularAttribute<Mdmptgtmdl, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmptgtmdl, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmptgtmdl, Date> createDate;
	public static volatile SingularAttribute<Mdmptgtmdl, BigInteger> mdmPolicy_id;
	public static volatile SingularAttribute<Mdmptgtmdl, String> name;
	public static volatile SingularAttribute<Mdmptgtmdl, BigInteger> targetId;
	public static volatile SingularAttribute<Mdmptgtmdl, Integer> targetType;
	public static volatile SingularAttribute<Mdmptgtmdl, Date> updateDate;
}
