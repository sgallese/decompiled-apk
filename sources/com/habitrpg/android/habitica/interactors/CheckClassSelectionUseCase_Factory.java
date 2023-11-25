package com.habitrpg.android.habitica.interactors;

import cc.a;

/* loaded from: classes4.dex */
public final class CheckClassSelectionUseCase_Factory implements a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final CheckClassSelectionUseCase_Factory INSTANCE = new CheckClassSelectionUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static CheckClassSelectionUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CheckClassSelectionUseCase newInstance() {
        return new CheckClassSelectionUseCase();
    }

    @Override // cc.a
    public CheckClassSelectionUseCase get() {
        return newInstance();
    }
}
