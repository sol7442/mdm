package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.602+0900")
@StaticMetamodel(UserPolicy.class)
public class UserPolicy_ {
	public static volatile SingularAttribute<UserPolicy, String> id;
	public static volatile SingularAttribute<UserPolicy, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserPolicy, String> actionSource;
	public static volatile SingularAttribute<UserPolicy, BigInteger> actionTime;
	public static volatile SingularAttribute<UserPolicy, BigInteger> actionUser;
	public static volatile SingularAttribute<UserPolicy, Date> createDate;
	public static volatile SingularAttribute<UserPolicy, BigInteger> mdmPolicy_id;
	public static volatile SingularAttribute<UserPolicy, String> name;
	public static volatile SingularAttribute<UserPolicy, Date> updateDate;
	public static volatile SingularAttribute<UserPolicy, BigInteger> userDevice_id;
}
