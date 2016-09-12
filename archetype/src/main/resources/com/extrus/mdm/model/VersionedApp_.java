package com.extrus.mdm.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-12T15:06:17.605+0900")
@StaticMetamodel(VersionedApp.class)
public class VersionedApp_ {
	public static volatile SingularAttribute<VersionedApp, String> id;
	public static volatile SingularAttribute<VersionedApp, String> aliasGroup;
	public static volatile SingularAttribute<VersionedApp, String> binaryFilePath;
	public static volatile SingularAttribute<VersionedApp, Integer> category;
	public static volatile SingularAttribute<VersionedApp, Byte> isAllowedUse;
	public static volatile SingularAttribute<VersionedApp, Byte> isInstalledApp;
	public static volatile SingularAttribute<VersionedApp, Byte> isOfficeApp;
	public static volatile SingularAttribute<VersionedApp, String> plistFilePath;
	public static volatile SingularAttribute<VersionedApp, String> tag;
	public static volatile SingularAttribute<VersionedApp, String> versionName;
}
