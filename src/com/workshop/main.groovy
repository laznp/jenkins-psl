#!/usr/bin/groovy
package com.workshop

import com.workshop.Config
import com.workshop.stages.*

def main(script) {
    // Object initialization

    // Pipeline object
	// Object initialization
	c = new Config()

	// Pipeline specific variable get from injected env
	// Mandatory variable will be check at details & validation steps
	def repository_name = ("${script.env.repository_name}" != "null") ? "${script.env.repository_name}" : ""
	def branch_name = ("${script.env.branch_name}" != "null") ? "${script.env.branch_name}" : ""
	def git_user = ("${script.env.git_user}" != "null") ? "${script.env.git_user}" : ""
	def docker_user = ("${script.env.docker_user}" != "null") ? "${script.env.docker_user}" : ""
	def app_port = ("${script.env.app_port}" != "null") ? "${script.env.app_port}" : ""
	def pr_num = ("${script.env.pr_num}" != "null") ? "${script.env.pr_num}" : ""

	// Pipeline object
	p = new Pipeline(
		repository_name,
		branch_name,
		git_user,
		docker_user,
		app_port,
		pr_num
   )


    ansiColor('xterm') {
		// PASS
    }
}
return this
