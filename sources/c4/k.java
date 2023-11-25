package c4;

import android.view.ViewGroup;

/* compiled from: Scene.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f8773a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f8774b;

    public static k b(ViewGroup viewGroup) {
        return (k) viewGroup.getTag(i.f8770b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ViewGroup viewGroup, k kVar) {
        viewGroup.setTag(i.f8770b, kVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f8773a) == this && (runnable = this.f8774b) != null) {
            runnable.run();
        }
    }
}
