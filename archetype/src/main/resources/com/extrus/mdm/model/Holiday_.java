package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.567+0900")
@StaticMetamodel(Holiday.class)
public class Holiday_ {
	public static volatile SingularAttribute<Holiday, String> id;
	public static volatile SingularAttribute<Holiday, BigInteger> actionCompany;
	public static volatile SingularAttribute<Holiday, String> actionSource;
	public static volatile SingularAttribute<Holiday, BigInteger> actionTime;
	public static volatile SingularAttribute<Holiday, BigInteger> actionUser;
	public static volatile SingularAttribute<Holiday, BigInteger> adminId;
	public static volatile SingularAttribute<Holiday, BigInteger> companyId;
	public static volatile SingularAttribute<Holiday, Date> createDate;
	public static volatile SingularAttribute<Holiday, String> holiday;
	public static volatile SingularAttribute<Holiday, String> holidayDesc;
	public static volatile SingularAttribute<Holiday, String> name;
	public static volatile SingularAttribute<Holiday, Date> updateDate;
}
