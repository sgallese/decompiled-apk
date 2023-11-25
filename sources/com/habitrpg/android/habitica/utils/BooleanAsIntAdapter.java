package com.habitrpg.android.habitica.utils;

import com.google.gson.s;
import ja.a;
import ja.b;
import ja.c;
import java.io.IOException;
import qc.q;

/* compiled from: BooleanAsIntAdapter.kt */
/* loaded from: classes4.dex */
public final class BooleanAsIntAdapter extends s<Boolean> {
    public static final int $stable = 0;

    /* compiled from: BooleanAsIntAdapter.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.s
    public Boolean read(a aVar) throws IOException {
        q.i(aVar, "in");
        b l02 = aVar.l0();
        int i10 = l02 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[l02.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                aVar.c0();
                return null;
            } else if (i10 == 3) {
                return Boolean.valueOf(aVar.R() != 0);
            } else if (i10 == 4) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.i0()));
            } else {
                throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + l02);
            }
        }
        return Boolean.valueOf(aVar.L());
    }

    @Override // com.google.gson.s
    public void write(c cVar, Boolean bool) throws IOException {
        q.i(cVar, "out");
        if (bool == null) {
            cVar.L();
        } else {
            cVar.x0(bool.booleanValue());
        }
    }
}
