package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.552+0900")
@StaticMetamodel(BeaconArea.class)
public class BeaconArea_ {
	public static volatile SingularAttribute<BeaconArea, String> id;
	public static volatile SingularAttribute<BeaconArea, BigInteger> actionCompany;
	public static volatile SingularAttribute<BeaconArea, String> actionSource;
	public static volatile SingularAttribute<BeaconArea, BigInteger> actionTime;
	public static volatile SingularAttribute<BeaconArea, BigInteger> actionUser;
	public static volatile SingularAttribute<BeaconArea, String> area;
	public static volatile SingularAttribute<BeaconArea, BigInteger> companyId;
	public static volatile SingularAttribute<BeaconArea, Date> createDate;
	public static volatile SingularAttribute<BeaconArea, String> description;
	public static volatile SingularAttribute<BeaconArea, Integer> major;
	public static volatile SingularAttribute<BeaconArea, Integer> minor;
	public static volatile SingularAttribute<BeaconArea, String> name;
	public static volatile SingularAttribute<BeaconArea, String> proximityUUID;
	public static volatile SingularAttribute<BeaconArea, Date> updateDate;
}
