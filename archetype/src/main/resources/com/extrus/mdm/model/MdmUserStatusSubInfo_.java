package com.extrus.mdm.model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.584+0900")
@StaticMetamodel(MdmUserStatusSubInfo.class)
public class MdmUserStatusSubInfo_ {
	public static volatile SingularAttribute<MdmUserStatusSubInfo, String> id;
	public static volatile SingularAttribute<MdmUserStatusSubInfo, String> uid;
	public static volatile SingularAttribute<MdmUserStatusSubInfo, BigInteger> userStatus_id;
	public static volatile SingularAttribute<MdmUserStatusSubInfo, Integer> userStatusType;
}
