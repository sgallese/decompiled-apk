package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimatorUtils.java */
/* loaded from: classes.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Animator animator) {
        animator.resume();
    }
}
