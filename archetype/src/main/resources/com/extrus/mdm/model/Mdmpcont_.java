package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.577+0900")
@StaticMetamodel(Mdmpcont.class)
public class Mdmpcont_ {
	public static volatile SingularAttribute<Mdmpcont, String> id;
	public static volatile SingularAttribute<Mdmpcont, BigInteger> actionCompany;
	public static volatile SingularAttribute<Mdmpcont, String> actionSource;
	public static volatile SingularAttribute<Mdmpcont, BigInteger> actionTime;
	public static volatile SingularAttribute<Mdmpcont, BigInteger> actionUser;
	public static volatile SingularAttribute<Mdmpcont, BigInteger> controlClass_id;
	public static volatile SingularAttribute<Mdmpcont, String> controlValue;
	public static volatile SingularAttribute<Mdmpcont, Date> createDate;
	public static volatile SingularAttribute<Mdmpcont, BigInteger> mdmPolicyCondition_id;
	public static volatile SingularAttribute<Mdmpcont, String> name;
	public static volatile SingularAttribute<Mdmpcont, Date> updateDate;
}
