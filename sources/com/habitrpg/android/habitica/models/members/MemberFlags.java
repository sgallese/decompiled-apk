package com.habitrpg.android.habitica.models.members;

import com.habitrpg.shared.habitica.models.AvatarFlags;
import io.realm.d1;
import io.realm.f4;
import io.realm.internal.o;

/* compiled from: MemberFlags.kt */
/* loaded from: classes4.dex */
public class MemberFlags extends d1 implements AvatarFlags, f4 {
    public static final int $stable = 8;
    private boolean chatRevoked;
    private boolean chatShadowMuted;
    private boolean classSelected;

    public MemberFlags() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getChatRevoked() {
        return realmGet$chatRevoked();
    }

    public final boolean getChatShadowMuted() {
        return realmGet$chatShadowMuted();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarFlags
    public boolean getClassSelected() {
        return realmGet$classSelected();
    }

    @Override // io.realm.f4
    public boolean realmGet$chatRevoked() {
        return this.chatRevoked;
    }

    @Override // io.realm.f4
    public boolean realmGet$chatShadowMuted() {
        return this.chatShadowMuted;
    }

    @Override // io.realm.f4
    public boolean realmGet$classSelected() {
        return this.classSelected;
    }

    @Override // io.realm.f4
    public void realmSet$chatRevoked(boolean z10) {
        this.chatRevoked = z10;
    }

    @Override // io.realm.f4
    public void realmSet$chatShadowMuted(boolean z10) {
        this.chatShadowMuted = z10;
    }

    @Override // io.realm.f4
    public void realmSet$classSelected(boolean z10) {
        this.classSelected = z10;
    }

    public final void setChatRevoked(boolean z10) {
        realmSet$chatRevoked(z10);
    }

    public final void setChatShadowMuted(boolean z10) {
        realmSet$chatShadowMuted(z10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarFlags
    public void setClassSelected(boolean z10) {
        realmSet$classSelected(z10);
    }
}
