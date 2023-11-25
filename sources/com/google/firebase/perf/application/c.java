package com.google.firebase.perf.application;

import aa.k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import java.util.WeakHashMap;
import w9.g;

/* compiled from: FragmentStateMonitor.java */
/* loaded from: classes3.dex */
public class c extends FragmentManager.k {

    /* renamed from: f  reason: collision with root package name */
    private static final v9.a f11755f = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f11756a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f11757b;

    /* renamed from: c  reason: collision with root package name */
    private final k f11758c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11759d;

    /* renamed from: e  reason: collision with root package name */
    private final d f11760e;

    public c(com.google.firebase.perf.util.a aVar, k kVar, a aVar2, d dVar) {
        this.f11757b = aVar;
        this.f11758c = kVar;
        this.f11759d = aVar2;
        this.f11760e = dVar;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void f(FragmentManager fragmentManager, Fragment fragment) {
        super.f(fragmentManager, fragment);
        v9.a aVar = f11755f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f11756a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f11756a.get(fragment);
        this.f11756a.remove(fragment);
        g<g.a> f10 = this.f11760e.f(fragment);
        if (!f10.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        j.a(trace, f10.c());
        trace.stop();
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void i(FragmentManager fragmentManager, Fragment fragment) {
        String simpleName;
        super.i(fragmentManager, fragment);
        f11755f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f11758c, this.f11757b, this.f11759d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f11756a.put(fragment, trace);
        this.f11760e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
