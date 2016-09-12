package com.extrus.mdm.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.584+0900")
@StaticMetamodel(MdmUserStatus.class)
public class MdmUserStatus_ {
	public static volatile SingularAttribute<MdmUserStatus, String> id;
	public static volatile SingularAttribute<MdmUserStatus, BigInteger> actionCompany;
	public static volatile SingularAttribute<MdmUserStatus, String> actionSource;
	public static volatile SingularAttribute<MdmUserStatus, BigInteger> actionTime;
	public static volatile SingularAttribute<MdmUserStatus, BigInteger> actionUser;
	public static volatile SingularAttribute<MdmUserStatus, Date> createDate;
	public static volatile SingularAttribute<MdmUserStatus, String> name;
	public static volatile SingularAttribute<MdmUserStatus, String> subData;
	public static volatile SingularAttribute<MdmUserStatus, String> uid;
	public static volatile SingularAttribute<MdmUserStatus, Date> updateDate;
	public static volatile SingularAttribute<MdmUserStatus, Integer> userStatusType;
}
