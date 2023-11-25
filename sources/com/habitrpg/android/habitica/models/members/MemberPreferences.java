package com.habitrpg.android.habitica.models.members;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.shared.habitica.models.AvatarPreferences;
import io.realm.d1;
import io.realm.h4;
import io.realm.internal.o;
import qc.q;

/* compiled from: MemberPreferences.kt */
/* loaded from: classes4.dex */
public class MemberPreferences extends d1 implements AvatarPreferences, h4 {
    public static final int $stable = 8;
    private String background;
    private String chair;
    private boolean costume;
    private boolean disableClasses;
    private Hair hair;
    private String language;
    private String shirt;
    private String size;
    private String skin;
    private boolean sleep;

    public MemberPreferences() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getBackground() {
        return realmGet$background();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getChair() {
        String str = null;
        if (realmGet$chair() == null || q.d(realmGet$chair(), DevicePublicKeyStringDef.NONE)) {
            return null;
        }
        String realmGet$chair = realmGet$chair();
        q.f(realmGet$chair);
        if (realmGet$chair.length() > 5) {
            String realmGet$chair2 = realmGet$chair();
            if (realmGet$chair2 != null) {
                str = realmGet$chair2.substring(0, 6);
                q.h(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (!q.d(str, "chair_")) {
                return realmGet$chair();
            }
        }
        return "chair_" + realmGet$chair();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public boolean getCostume() {
        return realmGet$costume();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public boolean getDisableClasses() {
        return realmGet$disableClasses();
    }

    public final String getLanguage() {
        return realmGet$language();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getShirt() {
        return realmGet$shirt();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getSize() {
        return realmGet$size();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getSkin() {
        return realmGet$skin();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public boolean getSleep() {
        return realmGet$sleep();
    }

    @Override // io.realm.h4
    public String realmGet$background() {
        return this.background;
    }

    @Override // io.realm.h4
    public String realmGet$chair() {
        return this.chair;
    }

    @Override // io.realm.h4
    public boolean realmGet$costume() {
        return this.costume;
    }

    @Override // io.realm.h4
    public boolean realmGet$disableClasses() {
        return this.disableClasses;
    }

    @Override // io.realm.h4
    public Hair realmGet$hair() {
        return this.hair;
    }

    @Override // io.realm.h4
    public String realmGet$language() {
        return this.language;
    }

    @Override // io.realm.h4
    public String realmGet$shirt() {
        return this.shirt;
    }

    @Override // io.realm.h4
    public String realmGet$size() {
        return this.size;
    }

    @Override // io.realm.h4
    public String realmGet$skin() {
        return this.skin;
    }

    @Override // io.realm.h4
    public boolean realmGet$sleep() {
        return this.sleep;
    }

    @Override // io.realm.h4
    public void realmSet$background(String str) {
        this.background = str;
    }

    @Override // io.realm.h4
    public void realmSet$chair(String str) {
        this.chair = str;
    }

    @Override // io.realm.h4
    public void realmSet$costume(boolean z10) {
        this.costume = z10;
    }

    @Override // io.realm.h4
    public void realmSet$disableClasses(boolean z10) {
        this.disableClasses = z10;
    }

    @Override // io.realm.h4
    public void realmSet$hair(Hair hair) {
        this.hair = hair;
    }

    @Override // io.realm.h4
    public void realmSet$language(String str) {
        this.language = str;
    }

    @Override // io.realm.h4
    public void realmSet$shirt(String str) {
        this.shirt = str;
    }

    @Override // io.realm.h4
    public void realmSet$size(String str) {
        this.size = str;
    }

    @Override // io.realm.h4
    public void realmSet$skin(String str) {
        this.skin = str;
    }

    @Override // io.realm.h4
    public void realmSet$sleep(boolean z10) {
        this.sleep = z10;
    }

    public void setBackground(String str) {
        realmSet$background(str);
    }

    public void setChair(String str) {
        realmSet$chair(str);
    }

    public void setCostume(boolean z10) {
        realmSet$costume(z10);
    }

    public void setDisableClasses(boolean z10) {
        realmSet$disableClasses(z10);
    }

    public void setHair(Hair hair) {
        realmSet$hair(hair);
    }

    public final void setLanguage(String str) {
        realmSet$language(str);
    }

    public void setShirt(String str) {
        realmSet$shirt(str);
    }

    public void setSize(String str) {
        realmSet$size(str);
    }

    public void setSkin(String str) {
        realmSet$skin(str);
    }

    public void setSleep(boolean z10) {
        realmSet$sleep(z10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public Hair getHair() {
        return realmGet$hair();
    }
}
