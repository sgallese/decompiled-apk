package com.habitrpg.android.habitica.interactors;

import cc.a;

/* loaded from: classes4.dex */
public final class ShareAvatarUseCase_Factory implements a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final ShareAvatarUseCase_Factory INSTANCE = new ShareAvatarUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static ShareAvatarUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ShareAvatarUseCase newInstance() {
        return new ShareAvatarUseCase();
    }

    @Override // cc.a
    public ShareAvatarUseCase get() {
        return newInstance();
    }
}
