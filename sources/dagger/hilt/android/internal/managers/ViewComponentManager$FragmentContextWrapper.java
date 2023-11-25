package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;

/* loaded from: classes4.dex */
public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Fragment f13162a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f13163b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f13164c;

    /* renamed from: d  reason: collision with root package name */
    private final s f13165d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewComponentManager$FragmentContextWrapper(Context context, Fragment fragment) {
        super((Context) ab.d.b(context));
        s sVar = new s() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.1
            @Override // androidx.lifecycle.s
            public void c(v vVar, p.a aVar) {
                if (aVar == p.a.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper.this.f13162a = null;
                    ViewComponentManager$FragmentContextWrapper.this.f13163b = null;
                    ViewComponentManager$FragmentContextWrapper.this.f13164c = null;
                }
            }
        };
        this.f13165d = sVar;
        this.f13163b = null;
        Fragment fragment2 = (Fragment) ab.d.b(fragment);
        this.f13162a = fragment2;
        fragment2.getLifecycle().a(sVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13164c == null) {
            if (this.f13163b == null) {
                this.f13163b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f13164c = this.f13163b.cloneInContext(this);
        }
        return this.f13164c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewComponentManager$FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) ab.d.b(((LayoutInflater) ab.d.b(layoutInflater)).getContext()));
        s sVar = new s() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.1
            @Override // androidx.lifecycle.s
            public void c(v vVar, p.a aVar) {
                if (aVar == p.a.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper.this.f13162a = null;
                    ViewComponentManager$FragmentContextWrapper.this.f13163b = null;
                    ViewComponentManager$FragmentContextWrapper.this.f13164c = null;
                }
            }
        };
        this.f13165d = sVar;
        this.f13163b = layoutInflater;
        Fragment fragment2 = (Fragment) ab.d.b(fragment);
        this.f13162a = fragment2;
        fragment2.getLifecycle().a(sVar);
    }
}
