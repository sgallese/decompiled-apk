package w6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f25425a;

    /* renamed from: b  reason: collision with root package name */
    private long f25426b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f25427c;

    /* renamed from: d  reason: collision with root package name */
    private int f25428d;

    /* renamed from: e  reason: collision with root package name */
    private int f25429e;

    public i(long j10, long j11) {
        this.f25427c = null;
        this.f25428d = 0;
        this.f25429e = 1;
        this.f25425a = j10;
        this.f25426b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f25428d = valueAnimator.getRepeatCount();
        iVar.f25429e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f25412c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return a.f25413d;
            }
            return interpolator;
        }
        return a.f25411b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f25425a;
    }

    public long d() {
        return this.f25426b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f25427c;
        if (timeInterpolator == null) {
            return a.f25411b;
        }
        return timeInterpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() != iVar.c() || d() != iVar.d() || g() != iVar.g() || h() != iVar.h()) {
            return false;
        }
        return e().getClass().equals(iVar.e().getClass());
    }

    public int g() {
        return this.f25428d;
    }

    public int h() {
        return this.f25429e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25428d = 0;
        this.f25429e = 1;
        this.f25425a = j10;
        this.f25426b = j11;
        this.f25427c = timeInterpolator;
    }
}
