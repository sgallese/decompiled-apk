package ua;

import ab.d;
import android.content.Context;
import java.util.Set;

/* compiled from: FragmentGetContextFix.java */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: FragmentGetContextFix.java */
    /* renamed from: ua.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0567a {
        Set<Boolean> getDisableFragmentGetContextFix();
    }

    public static boolean a(Context context) {
        boolean z10;
        Set<Boolean> disableFragmentGetContextFix = ((InterfaceC0567a) sa.b.a(context, InterfaceC0567a.class)).getDisableFragmentGetContextFix();
        if (disableFragmentGetContextFix.size() <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.d(z10, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (disableFragmentGetContextFix.isEmpty()) {
            return true;
        }
        return disableFragmentGetContextFix.iterator().next().booleanValue();
    }
}
