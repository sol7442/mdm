package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.573+0900")
@StaticMetamodel(MdmLog.class)
public class MdmLog_ {
	public static volatile SingularAttribute<MdmLog, String> id;
	public static volatile SingularAttribute<MdmLog, BigInteger> actionCompany;
	public static volatile SingularAttribute<MdmLog, String> actionSource;
	public static volatile SingularAttribute<MdmLog, BigInteger> actionTime;
	public static volatile SingularAttribute<MdmLog, BigInteger> actionUser;
	public static volatile SingularAttribute<MdmLog, Date> createDate;
	public static volatile SingularAttribute<MdmLog, byte[]> handlerArgs;
	public static volatile SingularAttribute<MdmLog, String> logClass_code;
	public static volatile SingularAttribute<MdmLog, BigInteger> managerId;
	public static volatile SingularAttribute<MdmLog, String> message;
	public static volatile SingularAttribute<MdmLog, byte[]> messageArgs;
	public static volatile SingularAttribute<MdmLog, String> name;
	public static volatile SingularAttribute<MdmLog, String> result;
	public static volatile SingularAttribute<MdmLog, Integer> severity;
	public static volatile SingularAttribute<MdmLog, BigInteger> sourceDevice_id;
	public static volatile SingularAttribute<MdmLog, String> sourceIp;
	public static volatile SingularAttribute<MdmLog, Integer> sourceType;
	public static volatile SingularAttribute<MdmLog, BigInteger> sourceUser_id;
	public static volatile SingularAttribute<MdmLog, Integer> status;
	public static volatile SingularAttribute<MdmLog, Date> updateDate;
}
