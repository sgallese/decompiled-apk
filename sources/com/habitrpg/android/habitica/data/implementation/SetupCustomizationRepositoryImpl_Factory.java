package com.habitrpg.android.habitica.data.implementation;

import android.content.Context;
import cc.a;

/* loaded from: classes4.dex */
public final class SetupCustomizationRepositoryImpl_Factory implements a {
    private final a<Context> contextProvider;

    public SetupCustomizationRepositoryImpl_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static SetupCustomizationRepositoryImpl_Factory create(a<Context> aVar) {
        return new SetupCustomizationRepositoryImpl_Factory(aVar);
    }

    public static SetupCustomizationRepositoryImpl newInstance(Context context) {
        return new SetupCustomizationRepositoryImpl(context);
    }

    @Override // cc.a
    public SetupCustomizationRepositoryImpl get() {
        return newInstance(this.contextProvider.get());
    }
}
