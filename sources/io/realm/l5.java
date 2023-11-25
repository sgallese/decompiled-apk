package io.realm;

import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_tasks_GroupAssignedDetailsRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface l5 {
    Date realmGet$assignedDate();

    String realmGet$assignedUserID();

    String realmGet$assignedUsername();

    String realmGet$assigningUsername();

    boolean realmGet$completed();

    Date realmGet$completedDate();

    void realmSet$assignedDate(Date date);

    void realmSet$assignedUserID(String str);

    void realmSet$assignedUsername(String str);

    void realmSet$assigningUsername(String str);

    void realmSet$completed(boolean z10);

    void realmSet$completedDate(Date date);
}
