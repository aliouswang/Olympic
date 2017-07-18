package com.example.aliouswang.olympic;

/**
 * Created by aliouswang on 2017/7/18.
 */

public class Demo {

//    public void apply() {
//        final MemoryCommitResult mcr = commitToMemory();
//        final Runnable awaitCommit = new Runnable() {
//            public void run() {
//                try {
//                    mcr.writtenToDiskLatch.await();
//                } catch (InterruptedException ignored) {
//                }
//            }
//        };
//
//        QueuedWork.add(awaitCommit);
//
//        Runnable postWriteRunnable = new Runnable() {
//            public void run() {
//                awaitCommit.run();
//                QueuedWork.remove(awaitCommit);
//            }
//        };
//
//        SharedPreferencesImpl.this.enqueueDiskWrite(mcr, postWriteRunnable);
//
//        // Okay to notify the listeners before it's hit disk
//        // because the listeners should always get the same
//        // SharedPreferences instance back, which has the
//        // changes reflected in memory.
//        notifyListeners(mcr);
//    }
}
