package com.googlecode.greysanatomy.console.server;

import com.googlecode.greysanatomy.console.rmi.RespResult;
import com.googlecode.greysanatomy.console.rmi.req.ReqCmd;
import com.googlecode.greysanatomy.console.rmi.req.ReqGetResult;
import com.googlecode.greysanatomy.console.rmi.req.ReqHeart;
import com.googlecode.greysanatomy.console.rmi.req.ReqKillJob;

import java.rmi.Remote;

/**
 * 控制台服务端interface
 *
 * @author chengtongda
 */
public interface ConsoleServerService extends Remote {

    /**
     * 发送命令
     *
     * @param cmd
     * @return
     */
    public RespResult postCmd(ReqCmd cmd) throws Exception;

    /**
     * 注册服务
     *
     * @return
     */
    public long register() throws Exception;

    /**
     * 核对PID是否正确
     *
     * @param pid
     * @return
     * @throws Exception
     */
    public boolean checkPID(int pid) throws Exception;

    /**
     * 获取命令执行结果
     *
     * @param req
     * @return
     */
    public RespResult getCmdExecuteResult(ReqGetResult req) throws Exception;

    /**
     * 杀死任务
     *
     * @param req
     */
    public void killJob(ReqKillJob req) throws Exception;

    /**
     * session心跳
     *
     * @param req
     */
    public boolean sessionHeartBeat(ReqHeart req) throws Exception;

}
