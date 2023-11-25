package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
final class b extends ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    private final List<ViewPager2.i> f7361a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10) {
        this.f7361a = new ArrayList(i10);
    }

    private void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewPager2.i iVar) {
        this.f7361a.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ViewPager2.i iVar) {
        this.f7361a.remove(iVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator<ViewPager2.i> it = this.f7361a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i10, float f10, int i11) {
        try {
            Iterator<ViewPager2.i> it = this.f7361a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i10) {
        try {
            Iterator<ViewPager2.i> it = this.f7361a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }
}
