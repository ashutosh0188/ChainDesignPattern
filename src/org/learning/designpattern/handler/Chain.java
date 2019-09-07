package org.learning.designpattern.handler;

public interface Chain {
    public void process();
    public void next(Chain chain);
}
