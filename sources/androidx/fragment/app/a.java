package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import androidx.lifecycle.p;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends k0 implements FragmentManager.m {

    /* renamed from: t  reason: collision with root package name */
    final FragmentManager f4658t;

    /* renamed from: u  reason: collision with root package name */
    boolean f4659u;

    /* renamed from: v  reason: collision with root package name */
    int f4660v;

    /* renamed from: w  reason: collision with root package name */
    boolean f4661w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FragmentManager fragmentManager) {
        super(fragmentManager.w0(), fragmentManager.z0() != null ? fragmentManager.z0().f().getClassLoader() : null);
        this.f4660v = -1;
        this.f4661w = false;
        this.f4658t = fragmentManager;
    }

    int A(boolean z10) {
        if (!this.f4659u) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new q0("FragmentManager"));
                B("  ", printWriter);
                printWriter.close();
            }
            this.f4659u = true;
            if (this.f4739i) {
                this.f4660v = this.f4658t.n();
            } else {
                this.f4660v = -1;
            }
            this.f4658t.a0(this, z10);
            return this.f4660v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void B(String str, PrintWriter printWriter) {
        C(str, printWriter, true);
    }

    public void C(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4741k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4660v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4659u);
            if (this.f4738h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4738h));
            }
            if (this.f4734d != 0 || this.f4735e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4734d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4735e));
            }
            if (this.f4736f != 0 || this.f4737g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4736f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4737g));
            }
            if (this.f4742l != 0 || this.f4743m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4742l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4743m);
            }
            if (this.f4744n != 0 || this.f4745o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4744n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4745o);
            }
        }
        if (!this.f4733c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f4733c.size();
            for (int i10 = 0; i10 < size; i10++) {
                k0.a aVar = this.f4733c.get(i10);
                switch (aVar.f4750a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f4750a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f4751b);
                if (z10) {
                    if (aVar.f4753d != 0 || aVar.f4754e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4753d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4754e));
                    }
                    if (aVar.f4755f != 0 || aVar.f4756g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f4755f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f4756g));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        int size = this.f4733c.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0.a aVar = this.f4733c.get(i10);
            Fragment fragment = aVar.f4751b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4661w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4738h);
                fragment.setSharedElementNames(this.f4746p, this.f4747q);
            }
            switch (aVar.f4750a) {
                case 1:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.C1(fragment, false);
                    this.f4658t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4750a);
                case 3:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.p1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.J0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.C1(fragment, false);
                    this.f4658t.G1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.C1(fragment, false);
                    this.f4658t.p(fragment);
                    break;
                case 8:
                    this.f4658t.E1(fragment);
                    break;
                case 9:
                    this.f4658t.E1(null);
                    break;
                case 10:
                    this.f4658t.D1(fragment, aVar.f4758i);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        for (int size = this.f4733c.size() - 1; size >= 0; size--) {
            k0.a aVar = this.f4733c.get(size);
            Fragment fragment = aVar.f4751b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4661w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.w1(this.f4738h));
                fragment.setSharedElementNames(this.f4747q, this.f4746p);
            }
            switch (aVar.f4750a) {
                case 1:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.C1(fragment, true);
                    this.f4658t.p1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4750a);
                case 3:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.G1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.C1(fragment, true);
                    this.f4658t.J0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.p(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4753d, aVar.f4754e, aVar.f4755f, aVar.f4756g);
                    this.f4658t.C1(fragment, true);
                    this.f4658t.y(fragment);
                    break;
                case 8:
                    this.f4658t.E1(null);
                    break;
                case 9:
                    this.f4658t.E1(fragment);
                    break;
                case 10:
                    this.f4658t.D1(fragment, aVar.f4757h);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment F(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f4733c.size()) {
            k0.a aVar = this.f4733c.get(i10);
            int i11 = aVar.f4750a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 6) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                this.f4733c.add(i10, new k0.a(9, fragment2, true));
                                aVar.f4752c = true;
                                i10++;
                                fragment2 = aVar.f4751b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.f4751b);
                        Fragment fragment3 = aVar.f4751b;
                        if (fragment3 == fragment2) {
                            this.f4733c.add(i10, new k0.a(9, fragment3));
                            i10++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.f4751b;
                    int i12 = fragment4.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.mContainerId == i12) {
                            if (fragment5 == fragment4) {
                                z10 = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f4733c.add(i10, new k0.a(9, fragment5, true));
                                    i10++;
                                    fragment2 = null;
                                }
                                k0.a aVar2 = new k0.a(3, fragment5, true);
                                aVar2.f4753d = aVar.f4753d;
                                aVar2.f4755f = aVar.f4755f;
                                aVar2.f4754e = aVar.f4754e;
                                aVar2.f4756g = aVar.f4756g;
                                this.f4733c.add(i10, aVar2);
                                arrayList.remove(fragment5);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f4733c.remove(i10);
                        i10--;
                    } else {
                        aVar.f4750a = 1;
                        aVar.f4752c = true;
                        arrayList.add(fragment4);
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f4751b);
            i10++;
        }
        return fragment2;
    }

    public String G() {
        return this.f4741k;
    }

    public void H() {
        if (this.f4749s != null) {
            for (int i10 = 0; i10 < this.f4749s.size(); i10++) {
                this.f4749s.get(i10).run();
            }
            this.f4749s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4733c.size() - 1; size >= 0; size--) {
            k0.a aVar = this.f4733c.get(size);
            int i10 = aVar.f4750a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4751b;
                            break;
                        case 10:
                            aVar.f4758i = aVar.f4757h;
                            break;
                    }
                }
                arrayList.add(aVar.f4751b);
            }
            arrayList.remove(aVar.f4751b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f4739i) {
            this.f4658t.i(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.k0
    public int j() {
        return A(false);
    }

    @Override // androidx.fragment.app.k0
    public int k() {
        return A(true);
    }

    @Override // androidx.fragment.app.k0
    public void l() {
        o();
        this.f4658t.d0(this, false);
    }

    @Override // androidx.fragment.app.k0
    public void m() {
        o();
        this.f4658t.d0(this, true);
    }

    @Override // androidx.fragment.app.k0
    public k0 n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4658t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.n(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.k0
    public void p(int i10, Fragment fragment, String str, int i11) {
        super.p(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f4658t;
    }

    @Override // androidx.fragment.app.k0
    public boolean q() {
        return this.f4733c.isEmpty();
    }

    @Override // androidx.fragment.app.k0
    public k0 r(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4658t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.r(fragment);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4660v >= 0) {
            sb2.append(" #");
            sb2.append(this.f4660v);
        }
        if (this.f4741k != null) {
            sb2.append(" ");
            sb2.append(this.f4741k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.k0
    public k0 v(Fragment fragment, p.b bVar) {
        if (fragment.mFragmentManager == this.f4658t) {
            if (bVar == p.b.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
            } else if (bVar != p.b.DESTROYED) {
                return super.v(fragment, bVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f4658t);
    }

    @Override // androidx.fragment.app.k0
    public k0 w(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.f4658t) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.w(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i10) {
        if (!this.f4739i) {
            return;
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        int size = this.f4733c.size();
        for (int i11 = 0; i11 < size; i11++) {
            k0.a aVar = this.f4733c.get(i11);
            Fragment fragment = aVar.f4751b;
            if (fragment != null) {
                fragment.mBackStackNesting += i10;
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f4751b + " to " + aVar.f4751b.mBackStackNesting);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        int size = this.f4733c.size() - 1;
        while (size >= 0) {
            k0.a aVar = this.f4733c.get(size);
            if (aVar.f4752c) {
                if (aVar.f4750a == 8) {
                    aVar.f4752c = false;
                    this.f4733c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f4751b.mContainerId;
                    aVar.f4750a = 2;
                    aVar.f4752c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        k0.a aVar2 = this.f4733c.get(i11);
                        if (aVar2.f4752c && aVar2.f4751b.mContainerId == i10) {
                            this.f4733c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(a aVar) {
        super(aVar.f4658t.w0(), aVar.f4658t.z0() != null ? aVar.f4658t.z0().f().getClassLoader() : null, aVar);
        this.f4660v = -1;
        this.f4661w = false;
        this.f4658t = aVar.f4658t;
        this.f4659u = aVar.f4659u;
        this.f4660v = aVar.f4660v;
        this.f4661w = aVar.f4661w;
    }
}
