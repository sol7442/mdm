package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.547+0900")
@StaticMetamodel(AppVerification.class)
public class AppVerification_ {
	public static volatile SingularAttribute<AppVerification, String> id;
	public static volatile SingularAttribute<AppVerification, BigInteger> actionCompany;
	public static volatile SingularAttribute<AppVerification, String> actionSource;
	public static volatile SingularAttribute<AppVerification, BigInteger> actionTime;
	public static volatile SingularAttribute<AppVerification, BigInteger> actionUser;
	public static volatile SingularAttribute<AppVerification, BigInteger> appId;
	public static volatile SingularAttribute<AppVerification, Date> createDate;
	public static volatile SingularAttribute<AppVerification, BigInteger> dvcId;
	public static volatile SingularAttribute<AppVerification, Integer> dvcVerifyTime;
	public static volatile SingularAttribute<AppVerification, Integer> errorCode;
	public static volatile SingularAttribute<AppVerification, String> name;
	public static volatile SingularAttribute<AppVerification, Integer> serverVerifyTime;
	public static volatile SingularAttribute<AppVerification, Integer> status;
	public static volatile SingularAttribute<AppVerification, String> token;
	public static volatile SingularAttribute<AppVerification, Date> updateDate;
}
