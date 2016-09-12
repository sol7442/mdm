package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.572+0900")
@StaticMetamodel(MdmInstallHistory.class)
public class MdmInstallHistory_ {
	public static volatile SingularAttribute<MdmInstallHistory, String> id;
	public static volatile SingularAttribute<MdmInstallHistory, BigInteger> actionCompany;
	public static volatile SingularAttribute<MdmInstallHistory, String> actionSource;
	public static volatile SingularAttribute<MdmInstallHistory, BigInteger> actionTime;
	public static volatile SingularAttribute<MdmInstallHistory, BigInteger> actionUser;
	public static volatile SingularAttribute<MdmInstallHistory, String> authToken;
	public static volatile SingularAttribute<MdmInstallHistory, Date> createDate;
	public static volatile SingularAttribute<MdmInstallHistory, Integer> flag;
	public static volatile SingularAttribute<MdmInstallHistory, String> name;
	public static volatile SingularAttribute<MdmInstallHistory, BigInteger> ownerId;
	public static volatile SingularAttribute<MdmInstallHistory, Integer> reinstall;
	public static volatile SingularAttribute<MdmInstallHistory, String> unqKey;
	public static volatile SingularAttribute<MdmInstallHistory, Date> updateDate;
	public static volatile SingularAttribute<MdmInstallHistory, BigInteger> userDeviceId;
	public static volatile SingularAttribute<MdmInstallHistory, String> version;
}
