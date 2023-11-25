package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4106a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final q0 f4107a;

        a(q0 q0Var) {
            this.f4107a = q0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            n0 b10 = this.f4107a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.d1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<n0> c10 = this.f4107a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).d1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f4107a.f(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class b extends a {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            n0 d10 = this.f4107a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.d1();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class c extends b {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4107a.a(i10, n0.e1(accessibilityNodeInfo), str, bundle);
        }
    }

    public q0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4106a = new c(this);
        } else {
            this.f4106a = new b(this);
        }
    }

    public n0 b(int i10) {
        return null;
    }

    public List<n0> c(String str, int i10) {
        return null;
    }

    public n0 d(int i10) {
        return null;
    }

    public Object e() {
        return this.f4106a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public q0(Object obj) {
        this.f4106a = obj;
    }

    public void a(int i10, n0 n0Var, String str, Bundle bundle) {
    }
}
