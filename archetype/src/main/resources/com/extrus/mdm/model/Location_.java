package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.569+0900")
@StaticMetamodel(Location.class)
public class Location_ {
	public static volatile SingularAttribute<Location, String> id;
	public static volatile SingularAttribute<Location, BigInteger> actionCompany;
	public static volatile SingularAttribute<Location, String> actionSource;
	public static volatile SingularAttribute<Location, BigInteger> actionTime;
	public static volatile SingularAttribute<Location, BigInteger> actionUser;
	public static volatile SingularAttribute<Location, String> address;
	public static volatile SingularAttribute<Location, String> altitude;
	public static volatile SingularAttribute<Location, String> areaCode;
	public static volatile SingularAttribute<Location, String> cellId;
	public static volatile SingularAttribute<Location, BigInteger> companyId;
	public static volatile SingularAttribute<Location, Date> createDate;
	public static volatile SingularAttribute<Location, String> description;
	public static volatile SingularAttribute<Location, String> latitude;
	public static volatile SingularAttribute<Location, String> longitude;
	public static volatile SingularAttribute<Location, String> name;
	public static volatile SingularAttribute<Location, Integer> radius;
	public static volatile SingularAttribute<Location, Date> updateDate;
	public static volatile SingularAttribute<Location, BigInteger> userDevice_id;
}
