package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.595+0900")
@StaticMetamodel(ThirdPartyCompany.class)
public class ThirdPartyCompany_ {
	public static volatile SingularAttribute<ThirdPartyCompany, String> id;
	public static volatile SingularAttribute<ThirdPartyCompany, BigInteger> actionCompany;
	public static volatile SingularAttribute<ThirdPartyCompany, String> actionSource;
	public static volatile SingularAttribute<ThirdPartyCompany, BigInteger> actionTime;
	public static volatile SingularAttribute<ThirdPartyCompany, BigInteger> actionUser;
	public static volatile SingularAttribute<ThirdPartyCompany, String> apiKey;
	public static volatile SingularAttribute<ThirdPartyCompany, Integer> companyType;
	public static volatile SingularAttribute<ThirdPartyCompany, Date> createDate;
	public static volatile SingularAttribute<ThirdPartyCompany, String> ipPattern;
	public static volatile SingularAttribute<ThirdPartyCompany, String> name;
	public static volatile SingularAttribute<ThirdPartyCompany, Date> updateDate;
}
