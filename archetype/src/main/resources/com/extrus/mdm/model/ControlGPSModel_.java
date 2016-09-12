package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.553+0900")
@StaticMetamodel(ControlGPSModel.class)
public class ControlGPSModel_ {
	public static volatile SingularAttribute<ControlGPSModel, String> id;
	public static volatile SingularAttribute<ControlGPSModel, BigInteger> actionCompany;
	public static volatile SingularAttribute<ControlGPSModel, String> actionSource;
	public static volatile SingularAttribute<ControlGPSModel, BigInteger> actionTime;
	public static volatile SingularAttribute<ControlGPSModel, BigInteger> actionUser;
	public static volatile SingularAttribute<ControlGPSModel, String> address;
	public static volatile SingularAttribute<ControlGPSModel, BigInteger> companyId;
	public static volatile SingularAttribute<ControlGPSModel, Date> createDate;
	public static volatile SingularAttribute<ControlGPSModel, String> description;
	public static volatile SingularAttribute<ControlGPSModel, String> locationGPS;
	public static volatile SingularAttribute<ControlGPSModel, String> name;
	public static volatile SingularAttribute<ControlGPSModel, Date> updateDate;
	public static volatile SingularAttribute<ControlGPSModel, BigInteger> userDevice_id;
}
