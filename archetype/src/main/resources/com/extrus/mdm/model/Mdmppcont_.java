package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.582+0900")
@StaticMetamodel(Mdmppcont.class)
public class Mdmppcont_ {
	public static volatile SingularAttribute<Mdmppcont, String> id;
	public static volatile SingularAttribute<Mdmppcont, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmppcont, String> actionSource;
	public static volatile SingularAttribute<Mdmppcont, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmppcont, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmppcont, BigInteger> controlClass_id;
	public static volatile SingularAttribute<Mdmppcont, String> controlValue;
	public static volatile SingularAttribute<Mdmppcont, Date> createDate;
	public static volatile SingularAttribute<Mdmppcont, String> name;
	public static volatile SingularAttribute<Mdmppcont, BigInteger> passingCondition_id;
	public static volatile SingularAttribute<Mdmppcont, Integer> passingType;
	public static volatile SingularAttribute<Mdmppcont, Date> updateDate;
}
