package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.566+0900")
@StaticMetamodel(Hmdmptgtmdl.class)
public class Hmdmptgtmdl_ {
	public static volatile SingularAttribute<Hmdmptgtmdl, String> id;
	public static volatile SingularAttribute<Hmdmptgtmdl, BigInteger> actionCompany;
	public static volatile SingularAttribute<Hmdmptgtmdl, String> actionSource;
	public static volatile SingularAttribute<Hmdmptgtmdl, BigInteger> actionTime;
	public static volatile SingularAttribute<Hmdmptgtmdl, BigInteger> actionUser;
	public static volatile SingularAttribute<Hmdmptgtmdl, Date> createDate;
	public static volatile SingularAttribute<Hmdmptgtmdl, BigInteger> hMdmPolicy_id;
	public static volatile SingularAttribute<Hmdmptgtmdl, String> name;
	public static volatile SingularAttribute<Hmdmptgtmdl, BigInteger> targetId;
	public static volatile SingularAttribute<Hmdmptgtmdl, Integer> targetType;
	public static volatile SingularAttribute<Hmdmptgtmdl, Date> updateDate;
}
