package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.521+0900")
@StaticMetamodel(AgentLog.class)
public class AgentLog_ {
	public static volatile SingularAttribute<AgentLog, String> id;
	public static volatile SingularAttribute<AgentLog, BigInteger> actionCompany;
	public static volatile SingularAttribute<AgentLog, String> actionSource;
	public static volatile SingularAttribute<AgentLog, BigInteger> actionTime;
	public static volatile SingularAttribute<AgentLog, BigInteger> actionUser;
	public static volatile SingularAttribute<AgentLog, Date> createDate;
	public static volatile SingularAttribute<AgentLog, String> etc;
	public static volatile SingularAttribute<AgentLog, Date> invokeDate;
	public static volatile SingularAttribute<AgentLog, Integer> levelFlag;
	public static volatile SingularAttribute<AgentLog, String> message;
	public static volatile SingularAttribute<AgentLog, String> name;
	public static volatile SingularAttribute<AgentLog, Integer> osType;
	public static volatile SingularAttribute<AgentLog, BigInteger> sourceDevice_id;
	public static volatile SingularAttribute<AgentLog, Date> updateDate;
}
