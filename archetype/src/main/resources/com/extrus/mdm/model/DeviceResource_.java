package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.559+0900")
@StaticMetamodel(DeviceResource.class)
public class DeviceResource_ {
	public static volatile SingularAttribute<DeviceResource, String> id;
	public static volatile SingularAttribute<DeviceResource, BigInteger> actionCompany;
	public static volatile SingularAttribute<DeviceResource, String> actionSource;
	public static volatile SingularAttribute<DeviceResource, BigInteger> actionTime;
	public static volatile SingularAttribute<DeviceResource, BigInteger> actionUser;
	public static volatile SingularAttribute<DeviceResource, Date> createDate;
	public static volatile SingularAttribute<DeviceResource, String> itemKey;
	public static volatile SingularAttribute<DeviceResource, Integer> itemType;
	public static volatile SingularAttribute<DeviceResource, String> itemValue;
	public static volatile SingularAttribute<DeviceResource, String> name;
	public static volatile SingularAttribute<DeviceResource, Date> updateDate;
	public static volatile SingularAttribute<DeviceResource, BigInteger> userDeviceId_id;
}
