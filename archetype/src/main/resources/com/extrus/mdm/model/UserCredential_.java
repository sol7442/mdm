package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.597+0900")
@StaticMetamodel(UserCredential.class)
public class UserCredential_ {
	public static volatile SingularAttribute<UserCredential, String> id;
	public static volatile SingularAttribute<UserCredential, BigInteger> actionCompany;
	public static volatile SingularAttribute<UserCredential, String> actionSource;
	public static volatile SingularAttribute<UserCredential, BigInteger> actionTime;
	public static volatile SingularAttribute<UserCredential, BigInteger> actionUser;
	public static volatile SingularAttribute<UserCredential, BigInteger> companyId;
	public static volatile SingularAttribute<UserCredential, Date> createDate;
	public static volatile SingularAttribute<UserCredential, String> credentialType;
	public static volatile SingularAttribute<UserCredential, String> credentialValue;
	public static volatile SingularAttribute<UserCredential, String> name;
	public static volatile SingularAttribute<UserCredential, Date> updateDate;
	public static volatile SingularAttribute<UserCredential, BigInteger> userId;
}
