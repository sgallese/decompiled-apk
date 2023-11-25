package d3;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f13099a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f13100b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f13101c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f13101c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f13100b == null) {
            synchronized (f13099a) {
                if (f13100b == null) {
                    f13100b = new b();
                }
            }
        }
        return f13100b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f13101c;
        if (cls != null) {
            return o.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
