package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.596+0900")
@StaticMetamodel(ThirdPartyDept.class)
public class ThirdPartyDept_ {
	public static volatile SingularAttribute<ThirdPartyDept, String> id;
	public static volatile SingularAttribute<ThirdPartyDept, BigInteger> actionCompany;
	public static volatile SingularAttribute<ThirdPartyDept, String> actionSource;
	public static volatile SingularAttribute<ThirdPartyDept, BigInteger> actionTime;
	public static volatile SingularAttribute<ThirdPartyDept, BigInteger> actionUser;
	public static volatile SingularAttribute<ThirdPartyDept, BigInteger> companyId;
	public static volatile SingularAttribute<ThirdPartyDept, Date> createDate;
	public static volatile SingularAttribute<ThirdPartyDept, BigInteger> deptId;
	public static volatile SingularAttribute<ThirdPartyDept, String> extCode;
	public static volatile SingularAttribute<ThirdPartyDept, String> name;
	public static volatile SingularAttribute<ThirdPartyDept, String> orderNum;
	public static volatile SingularAttribute<ThirdPartyDept, String> statusCode;
	public static volatile SingularAttribute<ThirdPartyDept, String> typeCode;
	public static volatile SingularAttribute<ThirdPartyDept, Date> updateDate;
}
