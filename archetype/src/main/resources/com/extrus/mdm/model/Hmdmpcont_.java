package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.565+0900")
@StaticMetamodel(Hmdmpcont.class)
public class Hmdmpcont_ {
	public static volatile SingularAttribute<Hmdmpcont, String> id;
	public static volatile SingularAttribute<Hmdmpcont, BigInteger> actionCompany;
	public static volatile SingularAttribute<Hmdmpcont, String> actionSource;
	public static volatile SingularAttribute<Hmdmpcont, BigInteger> actionTime;
	public static volatile SingularAttribute<Hmdmpcont, BigInteger> actionUser;
	public static volatile SingularAttribute<Hmdmpcont, BigInteger> controlClass_id;
	public static volatile SingularAttribute<Hmdmpcont, String> controlValue;
	public static volatile SingularAttribute<Hmdmpcont, Date> createDate;
	public static volatile SingularAttribute<Hmdmpcont, BigInteger> hMdmPolicyCondition_id;
	public static volatile SingularAttribute<Hmdmpcont, String> name;
	public static volatile SingularAttribute<Hmdmpcont, Date> updateDate;
}
